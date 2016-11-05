(ns koans.23-meta
  (:require [koan-engine.core :refer :all]))

(def giants
  (with-meta 'Giants
    {:league "National League"}))

(meditations
  "Some objects can be tagged using the with-meta function"
  "若干の物は、タグを付けられることができますwith-meta機能"
  (= __ (meta giants))

  "Or more succinctly with a reader macro"
  "または簡潔に読者マクロによるより多く"
  (= __ (meta '^{:division "West"} Giants))

  "While others can't"
  "他がそうすることができない間、"
  (= __ (try
          (with-meta
            2
            {:prime true})
          (catch ClassCastException e
            "This doesn't implement the IObj interface")))

  "Notice when metadata carries over"
  "メタデータがいつの上に持ち運ぶかについて気がついてください"
  (= __ (meta (merge '^{:foo :bar} {:a 1 :b 2}
                     {:b 3 :c 4})))

  "And when it doesn't"
  "そして、それがそうしないとき、"
  (= __ (meta (merge {:a 1 :b 2}
                     '^{:foo :bar} {:b 3 :c 4})))

  "Metadata can be used as a type hint to avoid reflection during runtime"
  "実行時の間、反射を避けるタイプ・ヒントとして、メタデータが使われることができます"
  (= __ (#(.charAt ^String % 0) "Cast me"))

  "You can directly update an object's metadata"
  "あなたは、物のメタデータを直接更新することができます"
  (= 8 (let [giants
             (with-meta
               'Giants
               {:world-series-titles (atom 7)})]
         (swap! (:world-series-titles (meta giants)) __)
         @(:world-series-titles (meta giants))))

  "You can also create a new object from another object with metadata"
  "あなたは、メタデータでもう一つの物から新しい物をつくることもできます"
  (= {:league "National League" :park "AT&T Park"}
     (meta (vary-meta giants
                      assoc __ __)))

  "But it won't affect behavior like equality"
  "しかし、それは平等のようなふるまいのふりをしません"
  (= __ (vary-meta giants dissoc :league))

  "Or the object's printed representation"
  "または物の印刷された表現"
  (= __ (pr-str (vary-meta giants dissoc :league))))
