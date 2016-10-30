(ns koans.07-functions
  (:require [koan-engine.core :refer :all]))

(defn multiply-by-ten [n]
  (* 10 n))

(defn square [n] (* n n))

(meditations
  "Calling a function is like giving it a hug with parentheses"
  "機能を呼ぶことは、括弧でそれに抱擁を与えるようです"
  (= __ (square 9))

  "Functions are usually defined before they are used"
  "彼らが使われる前に、機能は通常定められます"
  (= __ (multiply-by-ten 2))

  "But they can also be defined inline"
  "しかし、彼らは定義済みインラインでもありえます"
  (= __ ((fn [n] (* 5 n)) 2))

  "Or using an even shorter syntax"
  "またはさらにより短い構文を使用して"
  (= __ (#(* 15 %) 4))

  "Even anonymous functions may take multiple arguments"
  "さらに匿名の機能は、複数の議論をするかもしれません"
  (= __ (#(+ %1 %2 %3) 4 5 6))

  "Arguments can also be skipped"
  "議論は、スキップされることもできます"
  (= __ (#(* 15 %2) 1 2))

  "One function can beget another"
  "1つの機能は、もう一つを生じさせることができます"
  (= 9 (((fn [] ___)) 4 5))

  "Functions can also take other functions as input"
  "機能は、入力として他の機能をとることもできます"
  (= 20 ((fn [f] (f 4 5))
           ___))

  "Higher-order functions take function arguments"
  "高次機能は、機能議論をします"
  (= 25 (___
          (fn [n] (* n n))))

  "But they are often better written using the names of functions"
  "しかし、彼らは機能の名前を使用して、しばしばよりよく手紙を書かれます"
  (= 25 (___ square)))
