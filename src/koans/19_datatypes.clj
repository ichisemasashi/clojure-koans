(ns koans.19-datatypes
  (:require [koan-engine.core :refer :all]))

(defrecord Nobel [prize])
(deftype Pulitzer [prize])

(defprotocol Award
  (present [this recipient]))

(defrecord Oscar [category]
  Award
  (present [this recipient]
    (print (str "Congratulations on your "
                (:category this) " Oscar, "
                recipient
                "!"))))

(deftype Razzie [category]
  Award
  (present [this recipient]
    __))

(meditations
  "Holding records is meaningful only when the record is worthy of you"
  "記録があなたに値するときだけ、記録を持つことは意味があります"
  (= __ (.prize (Nobel. "peace")))

  "Types are quite similar"
  "タイプは、全く類似しています"
  (= __ (.prize (Pulitzer. "literature")))

  "Records may be treated like maps"
  "地図のような記録は、扱われるかもしれません"
  (= __ (:prize (Nobel. "physics")))

  "While types may not"
  "タイプがそうしないかもしれない間。"
  (= __ (:prize (Pulitzer. "poetry")))

  "Further study reveals why"
  "更なる研究は、理由を明らかにします"
  (= __
     (map map? [(Nobel. "chemistry")
                (Pulitzer. "music")]))

  "Either sort of datatype can define methods in a protocol"
  "どちらの種類のデータ型でも、プロトコルにおける方法を定めることができます"
  (= __
     (with-out-str (present (Oscar. "Best Picture") "Evil Alien Conquerors")))

  "Surely we can implement our own by now"
  "きっと、我々は今ごろは我々自身のものをインプリメントすることができます"
  (= "You're really the Worst Picture, Final Destination 5... sorry."
     (with-out-str (present (Razzie. "Worst Picture") "Final Destination 5"))))
