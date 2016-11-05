(ns koans.18-quote
  (:require [koan-engine.core :refer :all]))


(meditations
  "Wrap a quote around a list to suppress evaluation"
  "評価を抑えるために、引用でリストをくるんでください"
  (= (quote (1 2 3 4 5)) __)

  "There is a shortcut too!"
  "近道もあります！"
  (= (quote __) '(1 2 3 4 5))

  "You can quote symbols as well as lists... without evaluation!"
  "あなたは、シンボルならびにリストを引用することができます... 評価なしで！"
  (= __ (let [age 9] (quote age)))

  "You can use a literal list as a data collection without having Clojure try to call a function"
  "あなたは、Clojureに機能を呼ぼうとさせることのないデータ収集として、文字通りのリストを使うことができます"
  (= (cons 1 (__ (2 3))) (list 1 2 3) (cons 1 [2 3]))

  "The quote affects all of its arguments, not just the top level"
  "引用は、その議論（まさにトップレベルでない）の全てに影響を及ぼします"
  (= (list 1 __) '(1 (+ 2 3)))

  "Syntax-quote (`) acts similarly to the normal quote"
  "構文引用（）は、通常の引用に同様に行います"
  (= (list __ __ __) `(1 2 3) '(1 2 3))

  "Unquote (~) within a syntax-quoted expression lets you mark specific expressions as requiring evaluation"
  "引用文を終わります（~）構文を引合いに出された表現の範囲内で、あなたに特異性発現が評価を必要とすることであることを示させます"
  (= (list __ __) `(1 ~(+ 2 3)) '(1 5)))
