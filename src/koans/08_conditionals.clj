(ns koans.08-conditionals
  (:require [koan-engine.core :refer :all]))

(defn explain-exercise-velocity [exercise-term]
  (case exercise-term
        :bicycling        "pretty fast"
        :jogging          "not super fast"
        :walking          "not fast at all"
        "is that even exercise?"))

(meditations
  "You will face many decisions"
  "あなたは、多くの決定に直面します"
  (= __ (if (false? (= 4 5))
          :a
          :b))

  "Some of them leave you no alternative"
  "彼らの一部は、あなたに選択肢を残しません"
  (= __ (if (> 4 3)
          []))

  "And in such a situation you may have nothing"
  "そして、そのような状況では、何も持ちはしてもよくありません"
  (= __ (if (nil? 0)
          [:a :b :c]))

  "In others your alternative may be interesting"
  "他において、あなたの選択肢は面白い場合があります"
  (= :glory (if (not (empty? ()))
              :doom
              __))

  "You may have a multitude of possible paths"
  "あなたは、可能性がある経路の多数を持つかもしれません"
  (let [x 5]
    (= :your-road (cond (= x __) :road-not-taken
                        (= x __) :another-road-not-taken
                        :else __)))

  "Or your fate may be sealed"
  "または、あなたの運命は封をされるかもしれません"
  (= 'doom (if-not (zero? __)
          'doom
          'more-doom))

  "In case of emergency, go fast"
  "非常事態が生じた場合、速く行ってください"
  (= "pretty fast"
     (explain-exercise-velocity __))

  "But admit it when you don't know what to do"
  "しかし、あなたがどうすべきかわからないとき、それを認めます"
  (= __
     (explain-exercise-velocity :watching-tv)))
