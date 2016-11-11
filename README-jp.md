# Clojure Koans

### To READ DIFF
```
git diff master:./01_equalities.clj japanese-transration:./01_equalities.clj
git diff master:./02_strings.clj japanese-transration:./02_strings.clj
git diff master:./03_lists.clj japanese-transration:./03_lists.clj
git diff master:./04_vectors.clj japanese-transration:./04_vectors.clj
git diff master:./05_sets.clj japanese-transration:./05_sets.clj
git diff master:./06_maps.clj japanese-transration:./06_maps.clj
git diff master:./07_functions.clj japanese-transration:./07_functions.clj
git diff master:./08_conditionals.clj japanese-transration:./08_conditionals.clj
git diff master:./09_higher_order_functions.clj japanese-transration:./09_higher_order_functions.clj
git diff master:./10_runtime_polymorphism.clj japanese-transration:./10_runtime_polymorphism.clj
git diff master:./11_lazy_sequences.clj japanese-transration:./11_lazy_sequences.clj
git diff master:./12_sequence_comprehensions.clj japanese-transration:./12_sequence_comprehensions.clj
git diff master:./13_creating_functions.clj japanese-transration:./13_creating_functions.clj
git diff master:./14_recursion.clj japanese-transration:./14_recursion.clj
git diff master:./15_destructuring.clj japanese-transration:./15_destructuring.clj
git diff master:./16_refs.clj japanese-transration:./16_refs.clj
git diff master:./17_atoms.clj japanese-transration:./17_atoms.clj
git diff master:./18_quote.clj japanese-transration:./18_quote.clj
git diff master:./19_datatypes.clj japanese-transration:./19_datatypes.clj
git diff master:./20_java_interop.clj japanese-transration:./20_java_interop.clj
git diff master:./21_partition.clj japanese-transration:./21_partition.clj
git diff master:./22_group_by.clj japanese-transration:./22_group_by.clj
git diff master:./23_meta.clj japanese-transration:./23_meta.clj
git diff master:./24_macros.clj japanese-transration:./24_macros.clj
```

<!--
The Clojure Koans are a fun and easy way to get started with Clojure - no
experience assumed or required.  Just follow the instructions below to start
making tests pass!
-->
この「Clojure Koans」は楽しく手軽にClojureを始める手段のひとつです。特別な知識や経験は想定していません。
指示に従い、テストを通すだけです！

### Getting Started

<!--
The easiest and fastest way to get the koans up and running is to [download the
latest zip file from Github](https://github.com/functional-koans/clojure-koans/releases).
This way, you'll have all the dependencies you need, including Clojure itself
and JLine, and you can skip the rest of this section (skip to "Running the
Koans").
-->
簡単にしかも早く、この「Koans」を始めるには[これをダウンロード](https://github.com/functional-koans/clojure-koans/releases)します。
このやりかたなら、必要なモノは全て入手できますし、「Running the Koans」までの文章を読む必要がありません。

<!--
If you're starting from a cloned or forked repo, that's cool too. This way
you'll be able to track your progress in Git, and see how your answers compare
to others, by checking out the project's Network tab. You might want to create
your own branch - that way if you pull back the latest koans from master, it'll
be a bit easier to manage the inevitable conflicts if we make changes to
exercises you've already completed.
-->
「clone」や「fork」から始める？それもクールですよ！
このプロジェクトのNetworkタブをチェックすることによって、Gitで進展を追えるし、あなたの答えが他の人達と比べてどんな感じか見ることもできます。

あなたはあなた自身の枝をつくりたいかもしれません－そのように、あなたが支配者から最新の公案を撤退させるならば、我々があなたがすでに完了したエクササイズに変更をするならば、回避不能な紛争を管理することは少しより簡単です。

The only things you'll need to run the Clojure Koans are:

あなたがClojure Koansを走らせるために必要とする唯一のものは、以下の通りです：

- JRE 1.6 or higher
- [clojure-1.8.0.jar](http://repo1.maven.org/maven2/org/clojure/clojure/1.8.0/clojure-1.8.0.zip)

You can use [Leiningen](http://github.com/technomancy/leiningen) to
automatically install the Clojure jar in the right place. Leiningen will also
get you a couple more jarfiles, including JLine, which allows you some of the
functionality of readline (command-line history, for example).

適切な場所に自動的にClojureジャーをインストールするために、あなたはLeiningenを使うことができます。
Leiningenはあなたのためにももう2 jarfiles（JLineを含む）を得ます。そして、それは再増線（コマンド・ライン史、たとえば）の機能の一部をあなたに与えます。

### Installing dependencies
依存を装置すること

Dependencies are installed automatically with lein 2, but if for some reason
you're on lein 1 and can't upgrade, you'll need to run

依存はlein 2で自動的に装置されます、しかし、何かの理由でlein 1の上にいて、グレードアップすることができないならば、あなたは走る必要があります

`lein deps`

which will download all dependencies you need to run the Clojure koans.

そしてそれはあなたがClojure公案を走らせるために必要とするすべての依存をダウンロードします。

I strongly recommend that you upgrade to lein 2 instead!

あなたがそれよりもlein 2にグレードアップするよう、私は強く勧めます！

### Running the Koans

If you're running from the zipfile, simply run

あなたがzipfile（単に動く）から走っているならば、

`script/run` on Mac/\*nix

`script\run` on Windows

If you're running from a checkout using lein 2, run the koans via


lein 2（公案を動く）を使っているチェックアウトからあなたが走っているならば、

`lein koan run`

It's an auto-runner, so as you save your files with the correct answers, it will
advance you to the next koan or file (conveniently, all files are prefixed with
the sequence that you should follow).

それは自動-ランナーであるので、あなたが正解でファイルを保存して、次の公案またはファイルに（都合の良いことに、すべてのファイルはあなたが続かなければならないシーケンスで前に置かれます）、それはあなたを昇進させます。

You'll see something like this:

    Now meditate on /home/colin/Projects/clojure-koans/src/koans/01_equalities.clj:3
    ---------------------
    Assertion failed!
    We shall contemplate truth by testing reality, via equality.
    (= __ true)

The output is telling you that you have a failing test in the file named
`01_equalities.clj`, on line 3. So you just need to open that file up and make
it pass!  You'll always be filling in the blanks to make tests pass.
Sometimes there could be several correct answers (or even an infinite number):
any of them will work in these cases. Some tests will pass even if you replace
the blanks with whitespace (or nothing) instead of the expected answer. Make sure
you give one correct expression to replace each blank.

第3行の上で、01_equalities.cljという名前をつけられるファイルで、あなたが失敗しているテストを受けることを、生産高はあなたに示しています。
それで、あなたはちょうどそのファイルを開けて、それを通らせる必要があります！
あなたは、テストを通らせるために、常にブランクを埋めています。
時々、いくつかの正解（または無限の数さえ）が、あることができました：
彼らのどれでも、これらの場合働きます。
たとえあなたが期待される答えの代わりに空白を空白文字（または何もない）と入れ替えるとしても、いくらかのテストは通ります。
各ブランクを取り替えるために、1つの正しい表現をしてください。

The koans differ from normal TDD in that the tests are already written for you,
so you'll have to pay close attention to the failure messages, because up until
the very end, making a test pass just means that the next failure message comes
up.

あなたが精密に失敗メッセージに注意を払わなければならないように、最後まで上がっていて、テストを通らせることがちょうど次の失敗メッセージがやって来ることを意味するのでテストがあなたのためにすでに書かれるという点で、公案は通常のTDDと異なります。

While it might be easy (especially at first) to just fill in the blanks making
things pass, you should work thoughtfully, making sure you understand why the
answer is what it is.  Enjoy your path to Clojure enlightenment!

ちょうどものを通らせているブランクを埋めることが簡単かもしれない（特に最初は）間、あなたは考えにふけって働かなければなりません。そして、あなたが答えがなぜそれがそうであることであるかについて理解することを確認します。
Clojure啓蒙へのあなたの経路を楽しんでください！

### Trying more things out

より多くのものを試用すること

There's a REPL (Read-Evaluate-Print Loop) included in the Clojure Koans. Just
run:

Clojure公案に含まれるREPL（Read-Evaluate-Printなループ）が、あります。
ちょうど動きます：

`script/repl` on Mac/\*nix

`script\repl` on Windows

If you're on lein 2, `lein repl` is what you want instead.

あなたがlein 2の上にいるならば、lein replはあなたがそれよりも望むものです。

Here are some interesting commands you might try, once you're in a running REPL:

一旦あなたがランニングREPLでいるならば、あなたがためすかもしれない若干の面白いコマンドはここにあります：

```clojure
(find-doc "vec")
(find-doc #"vec$")
(doc vec)
```

And if those still don't make sense:

そして、それらが静まるかどうかは、意味をなしません：

```clojure
(doc doc)
(doc find-doc)
```

will show you what those commands mean.

あなたにそれらのコマンドが意味するものを示します。

You can exit the REPL with `CTRL-d` on any OS.

あなたは、どんなOS上にでも『ctrl-d』とともにREPLを出ることができます。

### Contributing
貢献すること

Patches are encouraged!  Make sure the answer sheet still passes
(`lein koan test`), and send a pull request.

パッチは促されます！
解答用紙がまだ通る（『lein公案テスト』）ことを確認してください、そして、引き要請を送信してください。


The file ideaboard.txt has lots of good ideas for new koans to start, or things
to add to existing koans.  So write some fun exercises, add your answers to
`resources/koans.clj`, and we'll get them in there!

ファイルideaboard.txtには、始まる新しい公案または既存の公案を増すものについてのたくさんの良いアイデアがあります。
それで、いくらかの楽しいエクササイズを書きなさいと、資源/koans.cljに対するあなたの答えは付け加えます、そして、我々は彼らをそこで入れます！

Please follow the guidelines in
http://tbaggery.com/2008/04/19/a-note-about-git-commit-messages.html for
commmit messages, and put your code in a feature branch (not master) before
making the pull request. This makes patches easier to review.

httpでガイドラインに従ってください：
//tbaggery.com/2008/04/19/a-note-about-git-commit-messages.htmlなcommmitメッセージ賛成の、そして、特徴枝（マスターでない）のあなたのコード引きに要請をして置かれた。
これは、概説するのがより簡単なパッチを行います。

Feel free to contact me (Colin Jones / trptcolin) on Github or elsewhere if you
have any questions or want more direction before you start pitching in.

Githubまたはどこか他の所であなたがやりだし始める前にあなたが質問をするか、より多くの方向を望むならば、私（コリン・ジョーンズ/trptcolin）に連絡してください。

### Contributors
貢献者

https://github.com/functional-koans/clojure-koans/contributors


### Credits
謝辞

These exercises were started by [Aaron Bedra](http://github.com/abedra) of
[Relevance, Inc.](http://github.com/relevance) in early 2010, as a learning
tool for newcomers to functional programming. Aaron's macro-fu makes these
koans extremely simple and fun to use, and to improve upon, and without
Relevance's initiative, this project would not exist.

関数型プログラミングの初心者のための学習道具として、これらのエクササイズは、2010年前半にRelevance社のアーロンBedraによって始まりました。
アーロンのマクロ府はとても単純なこれらの公案と使う楽しみを作ります、そして、Relevanceのイニシアティブに、そして、それなしでよくなるために、このプロジェクトが存在しません。

Using the [koans](http://en.wikipedia.org/wiki/koan) metaphor as a tool for
learning a programming language started with the
[Ruby Koans](http://rubykoans.com) by [EdgeCase](http://github.com/edgecase).


### License
ライセンス

The use and distribution terms for this software are covered by the
Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
which can be found in the file epl-v10.html at the root of this distribution.
By using this software in any fashion, you are agreeing to be bound by
the terms of this license.

この分布の根でファイルepl-v10.htmlで見つかるEclipse Publicライセンス1.0（http://opensource.org/licenses/eclipse-1.0.php）によって、このソフトウェアの用途と配布条件は、カバーされます。
どんなファッションのこのソフトウェアを用いてでも、あなたはこの許可の条件に束縛されることに同意しています。
