(ns koans.12-sequence-comprehensions
  (:require [koan-engine.core :refer :all]))

(meditations
  "シーケンス理解は、順番に各々の要素をシンボルに結びつけることができます"
  (= __
     (for [x (range 6)]
       x))

  "彼らは、マッピングを簡単に模倣することができます"
  (= '(0 1 4 9 16 25)
     (map (fn [x] (* x x))
          (range 6))
     (for [x (range 6)]
       __))

  そのうえ、濾過されること
  (= '(1 3 5 7 9)
     (filter odd? (range 10))
     (for [x __ :when (odd? x)]
       x))

  "これらの変化の組合せ取るに足らないです。"
  (= '(1 9 25 49 81)
     (map (fn [x] (* x x))
          (filter odd? (range 10)))
     (for [x (range 10) :when __]
       __))

  "より複雑な変化は、単に複数の拘束的な形をとります"
  (= [[:top :left] [:top :middle] [:top :right]
      [:middle :left] [:middle :middle] [:middle :right]
      [:bottom :left] [:bottom :middle] [:bottom :right]]
     (for [row [:top :middle :bottom]
           column [:left :middle :right]]
       __)))
