(ns koans.17-atoms
  (:require [koan-engine.core :refer :all]))

(def atomic-clock (atom 0))

(meditations
  "Atoms are like refs"
  "原子は、レフリーらしいです"
  (= __ @atomic-clock)

  "You can change at the swap meet"
  "あなたは、交換競技会で変わることができます"
  (= __ (do
          (swap! atomic-clock inc)
          @atomic-clock))

  "Keep taxes out of this: swapping requires no transaction"
  "税をこれの中に入れないでください：スワッピングは、業務を必要としません"
  (= 5 (do
         __
         @atomic-clock))

  "Any number of arguments might happen during a swap"
  "多くの議論は、交換の間、起こるかもしれません"
  (= __ (do
          (swap! atomic-clock + 1 2 3 4 5)
          @atomic-clock))

  "Atomic atoms are atomic"
  "原子原子は強力です"
  (= __ (do
          (compare-and-set! atomic-clock 100 :fin)
          @atomic-clock))

  "When your expectations are aligned with reality, things proceed that way"
  "あなたの予想が現実に合わせられるとき、物事はそのように進行します"
  (= :fin (do
            (compare-and-set! __ __ __)
            @atomic-clock)))
