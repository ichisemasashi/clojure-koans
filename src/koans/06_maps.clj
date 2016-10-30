(ns koans.06-maps
  (:require [koan-engine.core :refer :all]))

(meditations
  "Don't get lost when creating a map"
  "地図を作成するとき、道に迷わないでください"
  (= {:a 1 :b 2} (hash-map :a 1 __ __))

  "A value must be supplied for each key"
  "値は、各々のキーに供給されなければなりません"
  (= {:a 1} (hash-map :a __))

  "The size is the number of entries"
  "サイズは、エントリの数です"
  (= __ (count {:a 1 :b 2}))

  "You can look up the value for a given key"
  "あなたは、所定のキーのために値を調べることができます"
  (= __ (get {:a 1 :b 2} :b))

  "Maps can be used as functions to do lookups"
  "地図が、検索をする機能として使われることができます"
  (= __ ({:a 1 :b 2} :a))

  "And so can keywords"
  "そして、キーワードもそうすることができます"
  (= __ (:a {:a 1 :b 2}))

  "But map keys need not be keywords"
  "しかし、地図キーは、キーワードである必要はありません"
  (= __ ({2010 "Vancouver" 2014 "Sochi" 2018 "PyeongChang"} 2014))

  "You may not be able to find an entry for a key"
  "キーのためにエントリを見つけることができはしてもよくありません"
  (= __ (get {:a 1 :b 2} :c))

  "But you can provide your own default"
  "しかし、あなたはあなた自身のデフォルトを提供することができます"
  (= __ (get {:a 1 :b 2} :c :key-not-found))

  "You can find out if a key is present"
  "あなたは、キーが存在するかどうか知ることができます"
  (= __ (contains? {:a nil :b nil} :b))

  "Or if it is missing"
  "または、それはなくなっていますかどうか"
  (= __ (contains? {:a nil :b nil} :c))

  "Maps are immutable, but you can create a new and improved version"
  "地図は不変です、しかし、あなたは新しくて改善されたバージョンを作成することができます"
  (= {1 "January" 2 __} (assoc {1 "January"} 2 "February"))

  "You can also create a new version with an entry removed"
  "あなたは、エントリを削除して、新しいバージョンを作成することもできます"
  (= {__ __} (dissoc {1 "January" 2 "February"} 2))

  "Create a new map by merging"
  "結合することによって、新しい地図を作成してください"
  (= {:a 1 :b 2 __ __} (merge {:a 1 :b 2} {:c 3}))

  "Specify how to handle entries with same keys when merging"
  "結合するとき、同じキーでエントリを取り扱う方法を指定してください"
  (= {:a 1 :b __ :c 3} (merge-with + {:a 1 :b 1} {:b 1 :c 3}))

  "Often you will need to get the keys, but the order is undependable"
  "しばしば、あなたはキーを得る必要があります、しかし、順序は頼りにならないです"
  (= (list __ __ __)
     (sort (keys { 2014 "Sochi" 2018 "PyeongChang" 2010 "Vancouver"})))

  "You can get the values in a similar way"
  "あなたは、類似した方向で値を得ることができます"
  (= (list __ __ __)
     (sort (vals {2010 "Vancouver" 2014 "Sochi" 2018 "PyeongChang"})))

  "You can even iterate over the map entries as a seq"
  "あなたは、seq.として地図の上にエントリを繰り返すことさえできます。"
  (= {:a __ :b __}
     (into {}
           (map
            (fn [[k v]] [k (inc v)])
            {:a 1 :b 2}))))
