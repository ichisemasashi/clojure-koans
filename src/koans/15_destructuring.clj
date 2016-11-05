(ns koans.15-destructuring
  (:require [koan-engine.core :refer :all]))

(def test-address
  {:street-address "123 Test Lane"
   :city "Testerville"
   :state "TX"})

(meditations
  "Destructuring is an arbiter: it breaks up arguments"
  "Destructuringは、仲裁人です：それは、議論をバラバラにします"
  (= __ ((fn [[a b]] (str b a))
         [:foo :bar]))

  "Whether in function definitions"
  "機能定義であるかどうかにかかわらず、"
  (= (str "An Oxford comma list of apples, "
          "oranges, "
          "and pears.")
     ((fn [[a b c]] __)
      ["apples" "oranges" "pears"]))

  "Or in let expressions"
  "またはされた表現において"
  (= "Rich Hickey aka The Clojurer aka Go Time aka Lambda Guru"
     (let [[first-name last-name & aliases]
           (list "Rich" "Hickey" "The Clojurer" "Go Time" "Lambda Guru")]
       __))

  "You can regain the full argument if you like arguing"
  "口論するのが好きであるならば、あなたは完全な議論を回復することができます"
  (= {:original-parts ["Stephen" "Hawking"] :named-parts {:first "Stephen" :last "Hawking"}}
     (let [[first-name last-name :as full-name] ["Stephen" "Hawking"]]
       __))

  "Break up maps by key"
  "キーで地図をバラバラにしてください"
  (= "123 Test Lane, Testerville, TX"
     (let [{street-address :street-address, city :city, state :state} test-address]
       __))

  "Or more succinctly"
  "または簡潔により多く"
  (= "123 Test Lane, Testerville, TX"
     (let [{:keys [street-address __ __]} test-address]
       __))

  "All together now!"
  "現在一緒にすべて！"
  (= "Test Testerson, 123 Test Lane, Testerville, TX"
     (___ ["Test" "Testerson"] test-address)))
