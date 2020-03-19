(ns bob
  (:require [clojure.string :as str]))



(defn response-for [in]
  (let [s (str/trim in)]
    (cond
      (and (= s (str/upper-case s) (str/ends-with? s "?"))) "Calm down, I know what I'm doing!"
      (or (= s (str/upper-case s)) (str/ends-with? s "!")) "Whoa, chill out!"
      (str/ends-with? s "?") "Sure."
      :else "Whatever.")))
