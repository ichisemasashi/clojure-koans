(ns koans.04-vectors
  (:require [koan-engine.core :refer :all]))

(meditations
  "You can use vectors in clojure as array-like structures
   clojureのベクターを、配列のようなモノとして使える"
  (= 1 (count [42]))

  "You can create a vector from a list
   リストからベクターを生成できる"
  (= [1] (vec '(1)))

  "Or from some elements
   複数の要素からもできる"
  (= [nil nil] (vector nil nil))

  "But you can populate it with any number of elements at once
   しかし、一度に任意の数の要素を設定することができる"
  (= [1 2] (vec '(1 2)))

  "Conjoining to a vector is different than to a list
   ベクタのconjはリストのときと違う"
  (= [111 222 333] (conj [111 222] 333))

  "You can get the first element of a vector like so
   こんなふうに、ベクタの先頭要素を取得できます"
  (= :peanut (first [:peanut :butter :and :jelly]))

  "And the last in a similar fashion
   そして、同じように最後の要素もできます"
  (= :jelly (last [:peanut :butter :and :jelly]))

  "Or any index if you wish
   または、どれでも欲しい要素を取得できます"
  (= :jelly (nth [:peanut :butter :and :jelly] 3))

  "You can also slice a vector
   ベクタを区切ることもできます"
  (= [:butter :and ] (subvec [:peanut :butter :and :jelly] 1 3))

  "Equality with collections is in terms of values
   コレクションの等価性は値の面からです"
  (= (list 1 2 3) (vector 1 2 3)))
