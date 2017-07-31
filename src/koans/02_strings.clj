(ns koans.02-strings
  (:require [koan-engine.core :refer :all]
            [clojure.string :as string]))

(meditations
  "A string is nothing more than text surrounded by double quotes
  文字列とは、ダブルクォートで囲まれたテキストのことだ"
  (= "hello" "hello")

  "But double quotes are just magic on top of something deeper
   しかし、ダブルクオートは何か深いものの上にある単なる魔法だ"
  (= "world" (str 'world))

  "You can do more than create strings, you can put them together
  文字列をつくるだけでなく、それらを結合することができる"
  (= "Cool right?" (str "Cool " "right?"))

  "You can even get certain characters
  さらに、特定の文字を取得することもできる"
  (= \C (get "Characters" 0))

  "Or even count the characters
   また、更に文字数を数えることもできる"
  (= 11 (count "Hello World"))

  "But strings and characters are not the same
  ただし、文字列と文字は同じものではない"
  (= false (= \c "c"))

  "What if you only wanted to get part of a string?
  ある文字列の一部だけを取得するとどうなるか"
  (= "World" (subs "Hello World" 6 11))

  "How about joining together elements in a list?
  あるリストの要素をジョインするとどうなるか"
  (= "123" (string/join '(1 2 3)))

  "What if you wanted to separate them out?
  区切り文字を指定したいときは？"
  (= "1, 2, 3" (string/join ", " '(1 2 3)))

  "Maybe you want to separate out all your lines
  たぶん、各行ごとに分割したいよね"
  (= ["1" "2" "3"] (string/split-lines "1\n2\n3"))

  "You may want to make sure your words are backwards
  文字列を後ろから確認したいでしょう"
  (= "olleh" (string/reverse "hello"))

  "Maybe you want to find the index of the first occurence of a substring
  ある文字列が最初に発生するインデックスを探したいでしょう"
  (= 0 (string/index-of "hello world" "hello"))

  "Or maybe the last index of the same
  または、同様な最後のインデックス"
  (= 13 (string/last-index-of "hello world, hello" "hello"))

  "But when something doesn't exist, nothing is found
   でも、何かが存在しない時は、何も見つからない"
  (= nil (string/index-of "hello world" "bob"))

  "Sometimes you don't want whitespace cluttering the front and back
   時には、前後にある空白が欲くないこともある"
  (= "hello world" (string/trim "  \nhello world \t \n"))

  "You can check if something is a char
  なにかが「文字」であるか確認できる"
  (= true (char? \c))

  "But it may not be
  しかし、これは「文字」ではない"
  (= false (char? "a"))

  "But chars aren't strings
   また、「文字」は「文字列」ではありません"
  (= false (string? \b))

  "Strings are strings"
  (= true (string? "b"))

  "Some strings may be blank
   ある文字列は「空白」です。"
  (= true (string/blank? ""))

  "Even if at first glance they aren't
   たとえ、ぱっと見で違っていても"
  (= true (string/blank? " \n \t  "))

  "However, most strings aren't blank
   しかしながら、ほとんどの文字列は「空白」ではない"
  (= false (string/blank? "hello?\nare you out there?")))
