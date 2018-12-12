
Getting scala mode for emacs:

* http://ensime.github.io/editors/emacs/learning/
* http://ensime.github.io/editors/emacs/install/
* http://ensime.github.io/editors/emacs/scala-mode/

Getting started with scala:

`brew install java`
`brew install sbt` # scala execution environment (scala build tool)

hello.scala:

```
object hello { // object name must be the same as the filename
  def main(args: Array[String]): Unit = { // boilerplate
        println("Hello, World")
    }
}
```

Then run:

`sbt run` # executes the file

`sbt console` # gets you an interactive console to try things
