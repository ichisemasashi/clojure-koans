(ns koans.01-equalities
  (:require [koan-engine.core :refer :all]))

(meditations
  "We shall contemplate truth by testing reality, via equality"
  "平等を通して、我々は、現実をテストすることによって、真実を考えます"
  (= __ true)

  "To understand reality, we must compare our expectations against reality"
  "現実を理解するために、我々は現実に対して予想を比較しなければなりません"
  (= __ (+ 1 1))

  "You can test equality of many things"
  "あなたは、多くのものの平等をテストすることができます"
  (= (+ 3 4) 7 (+ 2 __))

  "Some things may appear different, but be the same"
  "若干のものは異なるように見えるかもしれないが、同じことであるかもしれませ"ん
  (= __ (= 2 2/1))

  "You cannot generally float to heavens of integers"
  "あなたは、整数の天に、一般に浮くことができません"
  (= __ (= 2 2.0))

  "But a looser equality is also possible"
  "しかし、また、より緩やかな同等は可能です"
  (= __ (== 2.0 2))

  "Something is not equal to nothing"
  "何か、何への同等でもあります"
  (= __ (not (= 1 nil)))

  "Strings, and keywords, and symbols: oh my!"
  "ひも、そして、キーワードとシンボル：まあ！"
  (= __ (= "hello" :hello 'hello))

  "Make a keyword with your keyboard"
  "あなたのキーボードでキーワードを作ります"
  (= :hello (keyword __))

  "Symbolism is all around us"
  "象徴性は、至る所我々です"
  (= 'hello (symbol __))

  "What could be equivalent to nothing?"
  "何への等価物も、何ではありえませんでしたか？"
  (= __ nil)

  "When things cannot be equal, they must be different"
  "物事が等しいはずがないとき、彼らは異なるにちがいありません"
  (not= :fill-in-the-blank __))
