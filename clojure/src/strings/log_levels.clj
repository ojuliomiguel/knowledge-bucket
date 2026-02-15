(ns log-levels
  (:require [clojure.string :as str]))

(defn message
  "Takes a string representing a log line
   and returns its message with whitespace trimmed."
  [s]
  (->> (str/split s #"\[.*?\]:\s*")
       last
       str/trim))

(defn log-level
  "Takes a string representing a log line
   and returns its message with whitespace trimmed."
  [s]
  (let [[_ level _]
        (re-find #"\[([A-Z]+)\s*(.*)]" s)] (str/lower-case level)))

(println (message "[ERROR]: Unexpected token"))

(defn reformat
  "Takes a string representing a log line and formats it
   with the message first and the log level in parentheses."
  [s]
  (let [[_ level message]
        (re-find #"\[([A-Z]+)\]:\s*(.*)" s)]
    (str message " (" (str/lower-case level) " )")))

(println (reformat "[INFO]: Operation completed"))