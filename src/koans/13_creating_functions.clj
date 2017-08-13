(ns koans.13-creating-functions
  (:require [koan-engine.core :refer :all]))

(defn square [x] (* x x))

(meditations
  "One may know what they seek by knowing what they do not seek
   何をさがしていないかを知ることによって求めるものを知ることができる"
  (= [true false true] (let [not-a-symbol? (complement symbol?)]
                  (map not-a-symbol? [:a 'b "c"])))

  "Praise and 'complement' may help you separate the wheat from the chaff
   賞賛とcomplementは小麦を籾殻から分離するのに役立ちます"
  (= [:wheat "wheat" 'wheat]
       (let [not-nil? (complement nil?)]
         (filter not-nil? [nil :wheat nil "wheat" nil 'wheat nil])))

  "Partial functions allow procrastination
   partial関数により遅延ができる"
  (= 20 (let [multiply-by-5 (partial * 5)]
          (multiply-by-5 4)))

  "Don't forget: first things first
   忘れないで。最初のものが最初です"
  (= [:a :b :c :d]
       (let [ab-adder (partial concat [:a :b])]
         (ab-adder [:c :d])))

  "Functions can join forces as one 'composed' function
   compによって複数の関数をひとつにできる"
  (= 25 (let [inc-and-square (comp square inc)]
          (inc-and-square 4)))

  "Have a go on a double dec-er
   二回decをする"
  (= 8 (let [double-dec (comp dec dec)]
          (double-dec 10)))

  "Be careful about the order in which you mix your functions
   関数を組み合わせる順序に注意"
  (= 99 (let [square-and-dec (comp dec square)]
          (square-and-dec 10))))
