(ns koans.16-refs
  (:require [koan-engine.core :refer :all]))

(def the-world (ref "hello"))
(def bizarro-world (ref {}))

(meditations
  "In the beginning, there was a word"
  "始めに、語がありました"
  (= __ (deref the-world))

  "You can get the word more succinctly, but it's the same"
  "あなたはより簡潔に語を得ることができます、しかし、それは同じことです"
  (= __ @the-world)

  "You can be the change you wish to see in the world."
  "あなたは、世界でわかることを望む変化でありえます。"
  (= __ (do
          (dosync (ref-set the-world "better"))
          @the-world))

  "Alter where you need not replace"
  "あなたが代わる必要がない所で、変わってください"
  (= __ (let [exclamator (fn [x] (str x "!"))]
          (dosync
           (alter the-world exclamator)
           (alter the-world exclamator)
           (alter the-world exclamator))
          @the-world))

  "Don't forget to do your work in a transaction!"
  "業務においてあなたの仕事をするのを忘れないでください！"
  (= 0 (do __
           @the-world))

  "Functions passed to alter may depend on the data in the ref"
  "変わるために通過される機能は、参照においてデータに依存するかもしれません"
  (= 20 (do
          (dosync (alter the-world ___))))

  "Two worlds are better than one"
  "2つの世界は、1よりよいです"
  (= ["Real Jerry" "Bizarro Jerry"]
       (do
         (dosync
          (ref-set the-world {})
          (alter the-world assoc :jerry "Real Jerry")
          (alter bizarro-world assoc :jerry "Bizarro Jerry")
          __))))
