(ns koans.02-strings
  (:require [koan-engine.core :refer :all]
            [clojure.string :as string]))

(meditations
  "A string is nothing more than text surrounded by double quotes"
  "ストリングはほんのダブルクォートによって囲まれるテキストにすぎない。"
  (= __ "hello")

  "But double quotes are just magic on top of something deeper"
  "しかし、ダブルクォートはちょうどより深い何かの上の魔法です"
  (= __ (str 'world))

  "You can do more than create strings, you can put them together"
  "あなたはストリングを作成するよりすることができます、あなたは彼らをまとめることができます"
  (= "Cool right?" (str __ __))

  "You can even get certain characters"
  "あなたは、特定の性格を得ることさえできます"
  (= \C (get "Characters" __))

  "Or even count the characters"
  "または、性格をさらに数えてください"
  (= __ (count "Hello World"))

  "But strings and characters are not the same"
  "しかし、ひもと性格は、同じことでありません"
  (= __ (= \c "c"))

  "What if you only wanted to get part of a string?"
  "あなたがストリングの一部を得たいだけであるならば、どうですか？"
  (= "World" (subs "Hello World" __ __))

  "How about joining together elements in a list?"
  "一緒にリストにおいて部隊に加わることはどう？"
  (= __ (string/join '(1 2 3)))

  "What if you wanted to separate them out?"
  "あなたが彼らを外へ別れさせることを望むならば、どうですか？"
  (= "1, 2, 3" (string/join __ '(1 2 3)))

  "Maybe you want to separate out all your lines"
  "多分、あなたはあなたのすべての線を外へ切り離したいでしょう"
  (= [__ __ __] (string/split-lines "1\n2\n3"))

  "You may want to make sure your words are backwards"
  "確かにあなたのことばが後方にそうである製造といいかもしれません。"
  (= __ (string/reverse "hello"))

  "Maybe you want to find the index of the first occurence of a substring"
  "多分、あなたは部分文字列の最初の発生のインデックスを見つけたいでしょう"
  (= 0 (string/index-of "hello world" __))

  "Or maybe the last index of the same"
  "または、多分、最後のものは同じことのインデックスを付けるでしょう"
  (= __ (string/last-index-of "hello world, hello" "hello"))

  "But when something doesn't exist, nothing is found"
  "しかし、何かが存在しないとき、何も見つかりません"
  (= __ (string/index-of "hello world" "bob"))

  "Sometimes you don't want whitespace cluttering the front and back"
  "時々、あなたは空白文字が正面をふさいでいることを望まないで、後退しません"
  (= __ (string/trim "  \nhello world \t \n"))

  "You can check if something is a char"
  "あなたは、何かがcharであるかどうか調べることができます"
  (= __ (char? \c))

  "But it may not be"
  "しかし、それはないかもしれません"
  (= __ (char? "a"))

  "But chars aren't strings"
  "しかし、charはひもでありません"
  (= __ (string? \b))

  "Strings are strings"
  "ひもは、ひもです"
  (= true (string? __))

  "Some strings may be blank"
  "いくらかのひもは空白である場合があります"
  (= __ (string/blank? ""))

  "Even if at first glance they aren't"
  "一見したところたとえ彼らがそうでないとしても、"
  (= __ (string/blank? " \n \t  "))

  "However, most strings aren't blank"
  "しかし、大部分のひもは、空白でありません"
  (= __ (string/blank? "hello?\nare you out there?")))
