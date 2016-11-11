(ns koans.03-lists
  (:require [koan-engine.core :refer :all]))

(meditations
  "リストは、機能または引用された書式によって表されることができます"
  (= '(__ __ __ __ __) (list 1 2 3 4 5))

  "彼らはClojure seqs（シーケンス）であるので、彼らは最初へのアクセスを許します"
  (= __ (first '(1 2 3 4 5)))

  "残りと同様に"
  (= __ (rest '(1 2 3 4 5)))

  "あなたの承認を数えます"
  (= __ (count '(dracula dooku chocula)))

  "彼らが去る前に。"
  (= __ (count '()))

  "何も残されないとき、残りは空です"
  (= __ (rest '(100)))

  "要素を正面に加えることによる構造は、簡単です"
  (= __ (cons :a '(:b :c :d :e)))

  "リストに要素を結合することも、難しくありません"
  (= __ (conj '(:a :b :c :d) :e))

  "あなたは、最初の要素を得るために、スタックのようなリストを使うことができます"
  (= __ (peek '(:a :b :c :d :e)))

  "または他"
  (= __ (pop '(:a :b :c :d :e)))

  "しかし、あなたが何も急に置かないようにしようとするならば、気をつけてください"
  (= __ (try
          (pop '())
          (catch IllegalStateException e
            "No dice!")))

  "何の残りも、とても厳しいです"
  (= __ (try
          (rest '())
          (catch IllegalStateException e
            "No dice!"))))
