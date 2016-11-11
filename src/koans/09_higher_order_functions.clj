(ns koans.09-higher-order-functions
  (:require [koan-engine.core :refer :all]))

(meditations
  "地図機能は、シーケンスをもう一つと関連づけます"
  (= [__ __ __] (map (fn [x] (* 4 x)) [1 2 3]))

  "あなたは、そのマッピングを作成するかもしれません"
  (= [1 4 9 16 25] (map (fn [x] __) [1 2 3 4 5]))

  "または、存在している機能の名前を使用してください"
  (= __ (map nil? [:a :b nil :c :d]))

  "フィルタは強くありえます"
  (= __ (filter (fn [x] false) '(:anything :goes :here)))

  "または非常に弱い"
  (= __ (filter (fn [x] true) '(:anything :goes :here)))

  "またはだいたい中で間に"
  (= [10 20 30] (filter (fn [x] __) [10 20 30 40 50 60 70 80]))

  "地図とフィルタは、結合されるかもしれません"
  (= [10 20 30] (map (fn [x] __) (filter (fn [x] __) [1 2 3 4 5 6 7 8])))

  "減ることは、結果を増やすことができます"
  (= __ (reduce (fn [a b] (* a b)) [1 2 3 4]))

  "あなたは、他にどこかに出発することができます"
  (= 2400 (reduce (fn [a b] (* a b)) __ [1 2 3 4]))

  "数は、ものが減らすことができる唯一のものでありません"
  (= "longest" (reduce (fn [a b]
                         (if (< __ __) b a))
                       ["which" "word" "is" "longest"])))
