require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /приветт
        a: привет(

    state: weather
        intent!: погода
        a: Пока пока

    state: currency
        intent!: курс
        a: f[f[f[f[

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}