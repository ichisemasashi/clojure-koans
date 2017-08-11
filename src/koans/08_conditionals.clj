(ns koans.08-conditionals
  (:require [koan-engine.core :refer :all]))

(defn explain-exercise-velocity [exercise-term]
  (case exercise-term
        :bicycling        "pretty fast"
        :jogging          "not super fast"
        :walking          "not fast at all"
        "is that even exercise?"))

(meditations
  "You will face many decisions
   あなたは多くの決断に直面するだろう"
  (= :a (if (false? (= 4 5))
          :a
          :b))

  "Some of them leave you no alternative
   いくつかの場合、「その他」が無い"
  (= [] (if (> 4 3)
           []))

  "And in such a situation you may have nothing
   そしてそのような状況では何も持てない"
  (= nil (if (nil? 0)
          [:a :b :c]))

  "In others your alternative may be interesting
   その他の場合、「その他」はとても重要でしょう"
  (= :glory (if (not (empty? ()))
              :doom
              :glory))

  "You may have a multitude of possible paths
   可能なルートを複数持つこともあります"
  (let [x 5]
    (= :your-road (cond (= x 0) :road-not-taken
                        (= x 3) :another-road-not-taken
                        :else :your-road)))

  "Or your fate may be sealed
   または、あなたの運命は封印されるかもしれない"
  (= 'doom (if-not (zero? 1)
          'doom
          'more-doom))

  "In case of emergency, go fast
   緊急事態ならば急いでゆこう"
  (= "pretty fast"
     (explain-exercise-velocity :bicycling))

  "But admit it when you don't know what to do
   しかし、どうすればよいか知らないときには、それを管理せよ"
  (= "is that even exercise?"
     (explain-exercise-velocity :watching-tv)))
