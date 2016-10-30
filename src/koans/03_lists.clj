(ns koans.03-lists
  (:require [koan-engine.core :refer :all]))

(meditations
  "Lists can be expressed by function or a quoted form"
  "リストは、機能または引用された書式によって表されることができます"
  (= '(__ __ __ __ __) (list 1 2 3 4 5))

  "They are Clojure seqs (sequences), so they allow access to the first"
  "彼らはClojure seqs（シーケンス）であるので、彼らは最初へのアクセスを許します"
  (= __ (first '(1 2 3 4 5)))

  "As well as the rest"
  "残りと同様に"
  (= __ (rest '(1 2 3 4 5)))

  "Count your blessings"
  "あなたの承認を数えます"
  (= __ (count '(dracula dooku chocula)))

  "Before they are gone"
  "彼らが去る前に。"
  (= __ (count '()))

  "The rest, when nothing is left, is empty"
  "何も残されないとき、残りは空です"
  (= __ (rest '(100)))

  "Construction by adding an element to the front is easy"
  "要素を正面に加えることによる構造は、簡単です"
  (= __ (cons :a '(:b :c :d :e)))

  "Conjoining an element to a list isn't hard either"
  "リストに要素を結合することも、難しくありません"
  (= __ (conj '(:a :b :c :d) :e))

  "You can use a list like a stack to get the first element"
  "あなたは、最初の要素を得るために、スタックのようなリストを使うことができます"
  (= __ (peek '(:a :b :c :d :e)))

  "Or the others"
  "または他"
  (= __ (pop '(:a :b :c :d :e)))

  "But watch out if you try to pop nothing"
  "しかし、あなたが何も急に置かないようにしようとするならば、気をつけてください"
  (= __ (try
          (pop '())
          (catch IllegalStateException e
            "No dice!")))

  "The rest of nothing isn't so strict"
  "何の残りも、とても厳しいです"
  (= __ (try
          (rest '())
          (catch IllegalStateException e
            "No dice!"))))
