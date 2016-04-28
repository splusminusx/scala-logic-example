resolvers += "twitter-repo" at "http://maven.twttr.com"

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.2.0")

addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "4.5.0")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.0.4")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.5.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.8.5")

addSbtPlugin("org.flywaydb" % "flyway-sbt" % "4.0")

resolvers += "Flyway" at "https://flywaydb.org/repo"