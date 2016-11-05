(ns koans.14-recursion
  (:require [koan-engine.core :refer :all]))

(defn is-even? [n]
  (if (= n 0)
    __
    (___ (is-even? (dec n)))))

(defn is-even-bigint? [n]
  (loop [n   n
         acc true]
    (if (= n 0)
      __
      (recur (dec n) (not acc)))))

(defn recursive-reverse [coll]
  __)

(defn factorial [n]
  __)

(meditations
  "Recursion ends with a base case"
  "再帰は、ベース・ケースで終わります"
  (= true (is-even? 0))

  "And starts by moving toward that base case"
  "そして、そのベース・ケースの方へ進むことから始めます"
  (= false (is-even? 1))

  "Having too many stack frames requires explicit tail calls with recur"
  "あまりに多くのスタック・フレームを持つことは、尾が訪問する完が繰り返されることを必要とします"
  (= false (is-even-bigint? 100003N))

  "Reversing directions is easy when you have not gone far"
  "あなたが成功しなかったとき、方向を逆にすることは簡単です"
  (= '(1) (recursive-reverse [1]))

  "Yet it becomes more difficult the more steps you take"
  "まだ、あなたがとるより多くの処置より難しくなります"
  (= '(6 5 4 3 2) (recursive-reverse [2 3 4 5 6]))

  "Simple things may appear simple."
  "それでも、あなたがとるより多くの処置より難しくなります"
  (= 1 (factorial 1))

  "They may require other simple steps."
  "彼らは、より別の単純なステップを必要とするかもしれません。"
  (= 2 (factorial 2))

  "Sometimes a slightly bigger step is necessary"
  "時々、わずかにより大きいステップは必要です"
  (= 6 (factorial 3))

  "And eventually you must think harder"
  "そして、結局、あなたはより一生懸命に考えなければなりません"
  (= 24 (factorial 4))

  "You can even deal with very large numbers"
  "あなたは、非常にかなりの数にさらに対処することができます"
  (< 1000000000000000000000000N (factorial 1000N))

  "But what happens when the machine limits you?"
  "しかし、機械があなたを制限するとき、何がありますか？"
  (< 1000000000000000000000000N (factorial 100003N)))
