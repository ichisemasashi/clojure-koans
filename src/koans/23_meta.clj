(ns koans.23-meta
  (:require [koan-engine.core :refer :all]))

(def giants
  (with-meta 'Giants
    {:league "National League"}))

(meditations
  "若干の物は、タグを付けられることができますwith-meta機能"
  (= __ (meta giants))

  "または簡潔に読者マクロによるより多く"
  (= __ (meta '^{:division "West"} Giants))

  "他がそうすることができない間、"
  (= __ (try
          (with-meta
            2
            {:prime true})
          (catch ClassCastException e
            "This doesn't implement the IObj interface")))

  "メタデータがいつの上に持ち運ぶかについて気がついてください"
  (= __ (meta (merge '^{:foo :bar} {:a 1 :b 2}
                     {:b 3 :c 4})))

  "そして、それがそうしないとき、"
  (= __ (meta (merge {:a 1 :b 2}
                     '^{:foo :bar} {:b 3 :c 4})))

  "実行時の間、反射を避けるタイプ・ヒントとして、メタデータが使われることができます"
  (= __ (#(.charAt ^String % 0) "Cast me"))

  "あなたは、物のメタデータを直接更新することができます"
  (= 8 (let [giants
             (with-meta
               'Giants
               {:world-series-titles (atom 7)})]
         (swap! (:world-series-titles (meta giants)) __)
         @(:world-series-titles (meta giants))))

  "あなたは、メタデータでもう一つの物から新しい物をつくることもできます"
  (= {:league "National League" :park "AT&T Park"}
     (meta (vary-meta giants
                      assoc __ __)))

  "しかし、それは平等のようなふるまいのふりをしません"
  (= __ (vary-meta giants dissoc :league))

  "または物の印刷された表現"
  (= __ (pr-str (vary-meta giants dissoc :league))))
