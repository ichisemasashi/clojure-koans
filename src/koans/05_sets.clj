(ns koans.05-sets
  (:require [koan-engine.core :refer :all]
            [clojure.set :as set]))

(meditations
  "あなたは、もう一つの収集を変えることによって、セットを作製することができます"
  (= #{3} (set __))

  "彼らを数えることは、他のコレクションを数えるようです"
  (= __ (count #{1 2 3}))

  "セットが*mathematical*セットであるのを思い出してください"
  (= __ (set '(1 1 2 2 3 3 4 4 5 5)))

  "あなたは、clojureに2セットの結合を要求することができます"
  (= __ (set/union #{1 2 3 4} #{2 3 5}))

  "そのうえ、交差点"
  (= __ (set/intersection #{1 2 3 4} #{2 3 5}))

  "しかし、違いを忘れないでください"
  (= __ (set/difference #{1 2 3 4 5} #{2 3 5})))
