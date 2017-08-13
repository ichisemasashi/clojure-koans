(ns koans.14-recursion
  (:require [koan-engine.core :refer :all]))

(defn is-even? [n]
  (if (= n 0)
    true
    (not (is-even? (dec n)))))

(defn is-even-bigint? [n]
  (loop [n   n
         acc true]
    (if (= n 0)
      acc
      (recur (dec n) (not acc)))))

(defn recursive-reverse [coll]
  (if (= 0 (count coll)) '()
      (cons (last coll) (recursive-reverse (butlast coll)))))

;; (defn factorial [n]
;;   (cond (= 0 n) 1
;;         (= 1 n) 1
;;         :else (* n (factorial (dec n)))))
(defn factorial [n]
  (loop [n n, ret n]
    (if (= 1 n) ret
        (recur (dec n) (* (dec n) ret)))))
(meditations
  "Recursion ends with a base case
   再帰は基本ケースで終了します"
  (= true (is-even? 0))

  "And starts by moving toward that base case
   そしてその基本ケースまで動くことで始まる"
  (= false (is-even? 1))

  "Having too many stack frames requires explicit tail calls with recur
   recurによる明確な末尾呼び出しは多すぎるスタックフレームをもつ。"
  (= false (is-even-bigint? 100003N))

  "Reversing directions is easy when you have not gone far
   長大なものを持たなければ、順番を変えるのは簡単です"
  (= '(1) (recursive-reverse [1]))

  "Yet it becomes more difficult the more steps you take
   しかし、より多くのステップを取ることが難しくなります"
  (= '(6 5 4 3 2) (recursive-reverse [2 3 4 5 6]))

  "Simple things may appear simple.
   簡単なものは簡単です"
  (= 1 (factorial 1))

  "They may require other simple steps.
   簡単なステップが必要です。"
  (= 2 (factorial 2))

  "Sometimes a slightly bigger step is necessary
   ときどき、より多くのステップが必要になります"
  (= 6 (factorial 3))

  "And eventually you must think harder
   そして場合によってはさらに考えないといけません"
  (= 24 (factorial 4))

  "You can even deal with very large numbers
   また、とても大きな数値もあつかえます"
  (< 1000000000000000000000000N (factorial 1000N))

  "But what happens when the machine limits you?
   しかし、マシンの限界を越えたら何が起きるか"
  (< 1000000000000000000000000N (factorial 100003N)))
