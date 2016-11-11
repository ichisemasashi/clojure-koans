(ns koans.13-creating-functions
  (:require [koan-engine.core :refer :all]))

(defn square [x] (* x x))

(meditations
  "人は、彼らが何を捜さないかわかっていることによって何を捜すかについてわかっているかもしれません"
  (= [__ __ __] (let [not-a-symbol? (complement symbol?)]
                  (map not-a-symbol? [:a 'b "c"])))

  "賞賛と『補語』は、あなたがふるいにかけるのに役立つかもしれません"
  (= [:wheat "wheat" 'wheat]
       (let [not-nil? ___]
         (filter not-nil? [nil :wheat nil "wheat" nil 'wheat nil])))

  "部分的な機能は、遅延を許します"
  (= 20 (let [multiply-by-5 (partial * 5)]
          (___ __)))

  "忘れません：重要なものから順番に"
  (= [__ __ __ __]
       (let [ab-adder (partial concat [:a :b])]
         (ab-adder [__ __])))

  "機能は、1つの『落ち着いた』機能として力を合わせることができます"
  (= 25 (let [inc-and-square (comp square inc)]
          (inc-and-square __)))

  "倍の上でやってみるdec-er"
  (= __ (let [double-dec (comp dec dec)]
          (double-dec 10)))

  "あなたが機能を混ぜる順序に注意してください"
  (= 99 (let [square-and-dec ___]
          (square-and-dec 10))))
