(ns koans.10-runtime-polymorphism
  (:require [koan-engine.core :refer :all]))

(defn hello
  ([] "Hello World!")
  ([a] (str "Hello, you silly " a "."))
  ([a & more] (str "Hello to this group: "
                   (apply str
                          (interpose ", " (cons a more)))
                   "!")))

(defmulti diet (fn [x] (:eater x)))
(defmethod diet :herbivore [a] __)
(defmethod diet :carnivore [a] __)
(defmethod diet :default [a] __)

(meditations
  "若干の機能が、異なる方向で使われることができます ― 議論なしで ― "
  (= __ (hello))

  "1つの議論で"
  (= __ (hello "world"))

  "または多くの議論で"
  (= __
     (hello "Peter" "Paul" "Mary"))

  "Multimethodsは、より複雑な派遣を許します"
  (= "Bambi eats veggies."
     (diet {:species "deer" :name "Bambi" :age 1 :eater :herbivore}))

  "動物には、異なる名前があります"
  (= "Thumper eats veggies."
     (diet {:species "rabbit" :name "Thumper" :age 1 :eater :herbivore}))

  "異なる方法が、急送機能結果に従い使われます"
  (= "Simba eats animals."
     (diet {:species "lion" :name "Simba" :age 1 :eater :carnivore}))

  "他が合わないとき、あなたはデフォルトの方法を使用するかもしれません"
  (= "I don't know what Rich Hickey eats."
     (diet {:name "Rich Hickey"})))
