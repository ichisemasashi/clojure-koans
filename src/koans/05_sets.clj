(ns koans.05-sets
  (:require [koan-engine.core :refer :all]
            [clojure.set :as set]))

(meditations
  "You can create a set by converting another collection
   setを他のコレクションから変換して生成できます"
  (= #{3} (set '(3)))

  "Counting them is like counting other collections
   setをcountすることは、他のコレクションのcountと同じです"
  (= 3 (count #{1 2 3}))

  "Remember that a set is a *mathematical* set
   setは数学の集合に相当することを覚えましょう"
  (= #{1 2 3 4 5} (set '(1 1 2 2 3 3 4 4 5 5)))

  "You can ask clojure for the union of two sets
   2つのsetのunion(和集合)"
  (= #{1 2 3 4 5} (set/union #{1 2 3 4} #{2 3 5}))

  "And also the intersection
   intersection(共通部分)"
  (= #{2 3} (set/intersection #{1 2 3 4} #{2 3 5}))

  "But don't forget about the difference
   difference(差集合)"
  (= #{1 4} (set/difference #{1 2 3 4 5} #{2 3 5})))
