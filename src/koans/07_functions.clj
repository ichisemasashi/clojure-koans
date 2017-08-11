(ns koans.07-functions
  (:require [koan-engine.core :refer :all]))

(defn multiply-by-ten [n]
  (* 10 n))

(defn square [n] (* n n))

(meditations
  "Calling a function is like giving it a hug with parentheses
   関数呼び出しは、括弧でハグをするようなものです"
  (= 81 (square 9))

  "Functions are usually defined before they are used
  関数は普通、使う前に定義される"
  (= 20 (multiply-by-ten 2))

  "But they can also be defined inline
   関数は、インラインでの定義もできます"
  (= 10 ((fn [n] (* 5 n)) 2))

  "Or using an even shorter syntax
   または、短縮形でもいけます"
  (= 60 (#(* 15 %) 4))

  "Even anonymous functions may take multiple arguments
   無名関数でさえも複数の引数を取ることができます"
  (= 15 (#(+ %1 %2 %3) 4 5 6))

  "Arguments can also be skipped
   引数をスキップすることもできる"
  (= 30 (#(* 15 %2) 1 2))

  "One function can beget another
   ある関数は他を持つことができる"
  (= 9 (((fn [] +)) 4 5))

  "Functions can also take other functions as input
   関数の入力として他の関数を取ることもできる"
  (= 20 ((fn [f] (f 4 5))
           *))

  "Higher-order functions take function arguments
   高階関数は関数引数を取る"
  (= 25 ((fn [f] (f 5))
          (fn [n] (* n n))))

  "But they are often better written using the names of functions
   しかし、しばしば高階関数は関数名を使って書くほうが良い"
  (= 25 ((fn [f] (f 5)) square)))
