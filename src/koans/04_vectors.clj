(ns koans.04-vectors
  (:require [koan-engine.core :refer :all]))

(meditations
  "You can use vectors in clojure as array-like structures"
  "あなたは、配列のような構造としてclojureでベクトルを使用することができます"
  (= __ (count [42]))

  "You can create a vector from a list"
  "あなたは、リストからベクトルを作成することができます"
  (= __ (vec '(1)))

  "Or from some elements"
  "または少し要素から"
  (= __ (vector nil nil))

  "But you can populate it with any number of elements at once"
  "しかし、あなたはすぐに多くの要素でそれに住むことができます"
  (= [1 __] (vec '(1 2)))

  "Conjoining to a vector is different than to a list"
  "リストにあるより、ベクトルに結合することは異なります"
  (= __ (conj [111 222] 333))

  "You can get the first element of a vector like so"
  "あなたは、そのようにベクトルの最初の要素を得ることができます"
  (= __ (first [:peanut :butter :and :jelly]))

  "And the last in a similar fashion"
  "そして、同じように最後"
  (= __ (last [:peanut :butter :and :jelly]))

  "Or any index if you wish"
  "または、あなたが望むならばどんなインデックスでも"
  (= __ (nth [:peanut :butter :and :jelly] 3))

  "You can also slice a vector"
  "あなたは、ベクトルをスライスすることもできます"
  (= __ (subvec [:peanut :butter :and :jelly] 1 3))

  "Equality with collections is in terms of values"
  "コレクションによる平等は、値に関してあります"
  (= (list 1 2 3) (vector 1 2 __)))
