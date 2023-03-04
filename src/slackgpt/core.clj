(ns slackgpt.core
  (:gen-class
    :methods [^:static [handler [Object] String]]))

(defn -handler
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World! 2"))