(ns koans.04-vectors
  (:require [koan-engine.core :refer :all]))

(meditations
  "あなたは、配列のような構造としてclojureでベクトルを使用することができます"
  (= __ (count [42]))

  "あなたは、リストからベクトルを作成することができます"
  (= __ (vec '(1)))

  "または少し要素から"
  (= __ (vector nil nil))

  "しかし、あなたはすぐに多くの要素でそれに住むことができます"
  (= [1 __] (vec '(1 2)))

  "リストにあるより、ベクトルに結合することは異なります"
  (= __ (conj [111 222] 333))

  "あなたは、そのようにベクトルの最初の要素を得ることができます"
  (= __ (first [:peanut :butter :and :jelly]))

  "そして、同じように最後"
  (= __ (last [:peanut :butter :and :jelly]))

  "または、あなたが望むならばどんなインデックスでも"
  (= __ (nth [:peanut :butter :and :jelly] 3))

  "あなたは、ベクトルをスライスすることもできます"
  (= __ (subvec [:peanut :butter :and :jelly] 1 3))

  "コレクションによる平等は、値に関してあります"
  (= (list 1 2 3) (vector 1 2 __)))
