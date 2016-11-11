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
  "記録があなたに値するときだけ、記録を持つことは意味があります"
  (= __ (.prize (Nobel. "peace")))

  "タイプは、全く類似しています"
  (= __ (.prize (Pulitzer. "literature")))

  "地図のような記録は、扱われるかもしれません"
  (= __ (:prize (Nobel. "physics")))

  "タイプがそうしないかもしれない間。"
  (= __ (:prize (Pulitzer. "poetry")))

  "更なる研究は、理由を明らかにします"
  (= __
     (map map? [(Nobel. "chemistry")
                (Pulitzer. "music")]))

  "どちらの種類のデータ型でも、プロトコルにおける方法を定めることができます"
  (= __
     (with-out-str (present (Oscar. "Best Picture") "Evil Alien Conquerors")))

  "きっと、我々は今ごろは我々自身のものをインプリメントすることができます"
  (= "You're really the Worst Picture, Final Destination 5... sorry."
     (with-out-str (present (Razzie. "Worst Picture") "Final Destination 5"))))
