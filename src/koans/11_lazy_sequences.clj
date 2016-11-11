(ns koans.11-lazy-sequences
  (:require [koan-engine.core :refer :all]))

(meditations
  "シーケンスを生み出す多くの方法が、あります"
  (= __ (range 1 5))

  "範囲は、デフォルトで始めから始まります"
  (= __ (range 5))

  "シーケンスが大きいとき、あなたが必要とするものに持っていくだけにしてください"
  (= [0 1 2 3 4 5 6 7 8 9]
     (take __ (range 100)))

  "または、あなたが必要としないものを落とすことによって、結果を制限してください"
  (= [95 96 97 98 99]
     (drop __ (range 100)))

  "繰り返しは、無限の怠惰なシーケンスを提供します"
  (= __ (take 20 (iterate inc 0)))

  "繰り返しは、キーです"
  (= [:a :a :a :a :a :a :a :a :a :a]
     (repeat 10 __))

  "繰り返しが、繰り返しのために使われることができます"
  (= (repeat 100 :hello)
     (take 100 (iterate ___ :hello))))
