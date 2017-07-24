(ns koans.01-equalities
  (:require [koan-engine.core :refer :all]))

(meditations
  "We shall contemplate truth by testing reality, via equality
   イクオリティを介して、実際にテストすることよって「真偽の真」を期待する"
  (= true true)

  "To understand reality, we must compare our expectations against reality
   現実を理解することで、現実との期待を比較せねばなりません"
  (= 2 (+ 1 1))

  "You can test equality of many things
  多くのモノのイクオリティをテストできます"
  (= (+ 3 4) 7 (+ 2 5))

  "Some things may appear different, but be the same
   あるモノは異なって表れます。でもそれは同じモノです"
  (= true (= 2 2/1))

  "You cannot generally float to heavens of integers
  普通、整数の天へ浮ぶことはできない"
  (= false (= 2 2.0))

  "But a looser equality is also possible
   しかし、より穏かなイクオリティも可能です"
  (= true (== 2.0 2))

  "Something is not equal to nothing
   あるモノはナニモノにも等しくない"
  (= (not (= 2 3)) (not (= 1 nil)))

  "Strings, and keywords, and symbols: oh my!
  文字列、キーワード、シンボル"
  (= false (= "hello" :hello 'hello))

  "Make a keyword with your keyboard
  キーボードでキーワードを作る"
  (= :hello (keyword "hello" ))

  "Symbolism is all around us
  シンボリズム(象徴主義)は私達の周りにあります"
  (= 'hello (symbol "hello" ))

  "What could be equivalent to nothing?
  無に等しいのは何？"
  (= nil  nil)

  "When things cannot be equal, they must be different
  等しくないなら、異なっているはずだ"
  (not= :fill-in-the-blank :fill-in-the-bank))
