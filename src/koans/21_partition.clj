(ns koans.21-partition
  (:require [koan-engine.core :refer :all]))

(meditations
  "To split a collection you can use the partition function"
  "コレクションを割るために、あなたは分割機能を使用することができます"
  (= '((0 1) (2 3)) (__ 2 (range 4)))

  "But watch out if there are not enough elements to form n sequences"
  "しかし、nシーケンスをつくるのに十分な要素がないならば、気をつけてください"
  (= '(__) (partition 3 [:a :b :c :d :e]))

  "You can use partition-all to include any leftovers too"
  "あなたは、どんな残り物でも含むために、分割-のすべてを使うことができます"
  (= __ (partition-all 3 (range 5)))

  "If you need to, you can start each sequence with an offset"
  "そうする必要があるならば、あなたは各々シーケンスをオフセットで始めることができます"
  (= '((0 1 2) (5 6 7) (10 11 12)) (partition 3 __ (range 13)))

  "Consider padding the last sequence with some default values..."
  "最後のシーケンスに若干のデフォルト値で当て物をすることを考えてください..."
  (= '((0 1 2) (3 4 5) (6 :hello)) (partition 3 3 [__] (range 7)))

  "... but notice that they will only pad up to the given sequence length"
  "... しかし、彼らが所定のシーケンス長までパッドを入れるだけである通知"
  (= '((0 1 2) (3 4 5) __) (partition 3 3 [:these :are "my" "words"] (range 7))))
