(ns koans.05-sets
  (:require [koan-engine.core :refer :all]
            [clojure.set :as set]))

(meditations
  "You can create a set by converting another collection"
  "あなたは、もう一つの収集を変えることによって、セットを作製することができます"
  (= #{3} (set __))

  "Counting them is like counting other collections"
  "彼らを数えることは、他のコレクションを数えるようです"
  (= __ (count #{1 2 3}))

  "Remember that a set is a *mathematical* set"
  "セットが*mathematical*セットであるのを思い出してください"
  (= __ (set '(1 1 2 2 3 3 4 4 5 5)))

  "You can ask clojure for the union of two sets"
  "あなたは、clojureに2セットの結合を要求することができます"
  (= __ (set/union #{1 2 3 4} #{2 3 5}))

  "And also the intersection"
  "そのうえ、交差点"
  (= __ (set/intersection #{1 2 3 4} #{2 3 5}))

  "But don't forget about the difference"
  "しかし、違いを忘れないでください"
  (= __ (set/difference #{1 2 3 4 5} #{2 3 5})))
