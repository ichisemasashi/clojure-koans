(ns koans.24-macros
  (:require [koan-engine.core :refer :all]))

(defmacro hello [x]
  (str "Hello, " x))

(defmacro infix [form]
  (list (second form) (first form) (nth form 2)))

(defmacro infix-better [form]
  `(~(second form) ; Note the syntax-quote (`) and unquote (~) characters!
    __
    __ ))

(defmacro r-infix [form]
  (cond (not (seq? form))
        __
        (= 1 (count form))
        `(r-infix ~(first form))
        :else
        (let [operator (second form)
              first-arg (first form)
              others __]
          `(~operator
            (r-infix ~first-arg)
            (r-infix ~others)))))

(meditations
  "マクロは、コンパイル時で作成される機能のようです"
  (= __ (hello "Macros!"))

  "私は、haz挿入辞を缶詰にします？"
  (= __ (infix (9 + 1)))

  "思い出してください。これらはコード変化だけです"
  (= __ (macroexpand '(infix (9 + 1))))

  "あなたはそれよりよくすることができます－手がFTWを巧みに作ります！"
  (= __ (macroexpand '(infix-better (10 * 2))))

  "あなたは彼らが欲しくて、ものは必ずしも働きません... "
  (= __ (macroexpand '(infix-better ( 10 + (2 * 3)))))

  "本当に、再帰を理解するまで、あなたは再帰を理解しません"
  (= 36 (r-infix (10 + (2 * 3) + (4 * 5)))))
