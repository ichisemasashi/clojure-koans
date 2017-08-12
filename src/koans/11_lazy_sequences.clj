(ns koans.11-lazy-sequences
  (:require [koan-engine.core :refer :all]))

(meditations
  "There are many ways to generate a sequence
   シーケンスを生成する方法はいろいろある"
  (= '(1 2 3 4) (range 1 5))

  "The range starts at the beginning by default
   rangeはデフォルトで始めから始める"
  (= '(0 1 2 3 4) (range 5))

  "Only take what you need when the sequence is large
   シーケンスが大きいときに必要なのはtake"
  (= [0 1 2 3 4 5 6 7 8 9]
     (take 10 (range 100)))

  "Or limit results by dropping what you don't need
   または、不要なものを切り捨てて答えを求める"
  (= [95 96 97 98 99]
     (drop 95 (range 100)))

  "Iteration provides an infinite lazy sequence
   iterateは無限遅延シーケンスを提供する"
  (= [0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19] (take 20 (iterate inc 0)))

  "Repetition is key
   繰り返しはキーです"
  (= [:a :a :a :a :a :a :a :a :a :a]
     (repeat 10 :a))

  "Iteration can be used for repetition
   iterateは繰り返しとして使うことができる"
  (= (repeat 100 :hello)
     (take 100 (iterate conj :hello))))
