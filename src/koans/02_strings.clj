(ns koans.02-strings
  (:require [koan-engine.core :refer :all]
            [clojure.string :as string]))

(meditations
  "ストリングはほんのダブルクォートによって囲まれるテキストにすぎない。"
  (= __ "hello")

  "しかし、ダブルクォートはちょうどより深い何かの上の魔法です"
  (= __ (str 'world))

  "あなたはストリングを作成するよりすることができます、あなたは彼らをまとめることができます"
  (= "Cool right?" (str __ __))

  "あなたは、特定の性格を得ることさえできます"
  (= \C (get "Characters" __))

  "または、性格をさらに数えてください"
  (= __ (count "Hello World"))

  "しかし、ひもと性格は、同じことでありません"
  (= __ (= \c "c"))

  "あなたがストリングの一部を得たいだけであるならば、どうですか？"
  (= "World" (subs "Hello World" __ __))

  "一緒にリストにおいて部隊に加わることはどう？"
  (= __ (string/join '(1 2 3)))

  "あなたが彼らを外へ別れさせることを望むならば、どうですか？"
  (= "1, 2, 3" (string/join __ '(1 2 3)))

  "多分、あなたはあなたのすべての線を外へ切り離したいでしょう"
  (= [__ __ __] (string/split-lines "1\n2\n3"))

  "確かにあなたのことばが後方にそうである製造といいかもしれません。"
  (= __ (string/reverse "hello"))

  "多分、あなたは部分文字列の最初の発生のインデックスを見つけたいでしょう"
  (= 0 (string/index-of "hello world" __))

  "または、多分、最後のものは同じことのインデックスを付けるでしょう"
  (= __ (string/last-index-of "hello world, hello" "hello"))

  "しかし、何かが存在しないとき、何も見つかりません"
  (= __ (string/index-of "hello world" "bob"))

  "時々、あなたは空白文字が正面をふさいでいることを望まないで、後退しません"
  (= __ (string/trim "  \nhello world \t \n"))

  "あなたは、何かがcharであるかどうか調べることができます"
  (= __ (char? \c))

  "しかし、それはないかもしれません"
  (= __ (char? "a"))

  "しかし、charはひもでありません"
  (= __ (string? \b))

  "ひもは、ひもです"
  (= true (string? __))

  "いくらかのひもは空白である場合があります"
  (= __ (string/blank? ""))

  "一見したところたとえ彼らがそうでないとしても、"
  (= __ (string/blank? " \n \t  "))

  "しかし、大部分のひもは、空白でありません"
  (= __ (string/blank? "hello?\nare you out there?")))
