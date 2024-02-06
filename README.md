# Mill input watch

Thie demonstrates an issue with [Mill](https://github.com/com-lihaoyi/mill) v0.11.7 and `T.input`s being constantly
reevaluated while in watch mode.

To reproduce, clone this repo, `cd` into it, then run:

```bash
./mill -w test.compile
```

You should see Mill's ticker constantly changing:

![mill ticker](https://github.com/mrdziuban/mill-input-watch/assets/4718399/34919ca5-8ddf-4f21-9f5f-2d8fce7d3cb2)
