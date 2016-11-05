(ns koans.09-higher-order-functions
  (:require [koan-engine.core :refer :all]))

(meditations
  "The map function relates a sequence to another"
  "地図機能は、シーケンスをもう一つと関連づけます"
  (= [__ __ __] (map (fn [x] (* 4 x)) [1 2 3]))

  "You may create that mapping"
  "あなたは、そのマッピングを作成するかもしれません"
  (= [1 4 9 16 25] (map (fn [x] __) [1 2 3 4 5]))

  "Or use the names of existing functions"
  "または、存在している機能の名前を使用してください"
  (= __ (map nil? [:a :b nil :c :d]))

  "A filter can be strong"
  "フィルタは強くありえます"
  (= __ (filter (fn [x] false) '(:anything :goes :here)))

  "Or very weak"
  "または非常に弱い"
  (= __ (filter (fn [x] true) '(:anything :goes :here)))

  "Or somewhere in between"
  "またはだいたい中で間に"
  (= [10 20 30] (filter (fn [x] __) [10 20 30 40 50 60 70 80]))

  "Maps and filters may be combined"
  "地図とフィルタは、結合されるかもしれません"
  (= [10 20 30] (map (fn [x] __) (filter (fn [x] __) [1 2 3 4 5 6 7 8])))

  "Reducing can increase the result"
  "減ることは、結果を増やすことができます"
  (= __ (reduce (fn [a b] (* a b)) [1 2 3 4]))

  "You can start somewhere else"
  "あなたは、他にどこかに出発することができます"
  (= 2400 (reduce (fn [a b] (* a b)) __ [1 2 3 4]))

  "Numbers are not the only things one can reduce"
  "数は、ものが減らすことができる唯一のものでありません"
  (= "longest" (reduce (fn [a b]
                         (if (< __ __) b a))
                       ["which" "word" "is" "longest"])))
