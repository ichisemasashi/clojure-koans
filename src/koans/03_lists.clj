(ns koans.03-lists
  (:require [koan-engine.core :refer :all]))

(meditations
  "Lists can be expressed by function or a quoted form
  リストは関数か囲まれた形で表される"
  (= '(1 2 3 4 5) (list 1 2 3 4 5))

  "They are Clojure seqs (sequences), so they allow access to the first
   Clojureのシーケンスなので、\"first\"へアクセスできる"
  (= 1 (first '(1 2 3 4 5)))

  "As well as the rest
  restへも同様"
  (= '(2 3 4 5) (rest '(1 2 3 4 5)))

  "Count your blessings
   単語を数える"
  (= 3 (count '(dracula dooku chocula)))

  "Before they are gone
  なくなる前に"
  (= 0 (count '()))

  "The rest, when nothing is left, is empty
  restは、何も残ってないときは、空"
  (= '() (rest '(100)))

  "Construction by adding an element to the front is easy
  要素を先頭にconsするのは簡単"
  (= '(:a :b :c :d :e) (cons :a '(:b :c :d :e)))

  "Conjoining an element to a list isn't hard either
   要素をリストへconjすることも同様に難しくない"
  (= '(:e :a :b :c :d) (conj '(:a :b :c :d) :e))

  "You can use a list like a stack to get the first element
  先頭の要素を取得するのに、リストをスタックのように使えます"
  (= :a (peek '(:a :b :c :d :e)))

  "Or the others"
  (= '(:b :c :d :e) (pop '(:a :b :c :d :e)))

  "But watch out if you try to pop nothing
   しかし、もし何もポップしないようにしようとすると"
  (= "No dice!" (try
          (pop '())
          (catch IllegalStateException e
            "No dice!")))

  "The rest of nothing isn't so strict
   何もないときのrestはそんなに厳しくない"
  (= '() (try
           (rest '())
           (catch IllegalStateException e
             "No dice!"))))
