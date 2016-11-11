(ns koans.17-atoms
  (:require [koan-engine.core :refer :all]))

(def atomic-clock (atom 0))

(meditations
  "原子は、レフリーらしいです"
  (= __ @atomic-clock)

  "あなたは、交換競技会で変わることができます"
  (= __ (do
          (swap! atomic-clock inc)
          @atomic-clock))

  "税をこれの中に入れないでください：スワッピングは、業務を必要としません"
  (= 5 (do
         __
         @atomic-clock))

  "多くの議論は、交換の間、起こるかもしれません"
  (= __ (do
          (swap! atomic-clock + 1 2 3 4 5)
          @atomic-clock))

  "原子原子は強力です"
  (= __ (do
          (compare-and-set! atomic-clock 100 :fin)
          @atomic-clock))

  "あなたの予想が現実に合わせられるとき、物事はそのように進行します"
  (= :fin (do
            (compare-and-set! __ __ __)
            @atomic-clock)))
