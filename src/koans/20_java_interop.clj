(ns koans.20-java-interop
  (:require [koan-engine.core :refer :all]))

(meditations
  "You may have done more with Java than you know"
  "あなたは、知っているより多くのものをJavaでしたかもしれません"
  (= __ (class "warfare")) ; hint: try typing (javadoc "warfare") in the REPL

  "The dot signifies easy and direct Java interoperation"
  "点は、簡単で直接のJava相互運用を意味します"
  (= __ (.toUpperCase "select * from"))

  "But instance method calls are very different from normal functions"
  "しかし、例方法呼び出しは、通常の機能と非常に異なります"
  (= ["SELECT" "FROM" "WHERE"] (map ___ ["select" "from" "where"]))

  "Constructing might be harder than breaking"
  "造ることは、破壊より難しいかもしれません"
  (= 10 (let [latch (java.util.concurrent.CountDownLatch. __)]
          (.getCount latch)))

  "Static methods are slashing prices!"
  "静的方法は、価格を大幅削減しています！"
  (== __ (Math/pow 2 10)))
