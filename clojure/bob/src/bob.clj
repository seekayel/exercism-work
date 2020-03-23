(ns bob
  (:require [clojure.string :as str]))



(defn response-for [in]
  (let [s (str/trim in)]
    ; (println s)
    ; (println (and (= s (str/upper-case s) (str/ends-with? s "?"))))
    ; (println (= s (str/upper-case s)))
    ; (println (str/ends-with? s "?"))
    (cond
      (= s "") "Fine. Be that way!"
      (and (= s (str/upper-case s)) (str/ends-with? s "?") (re-find #"[A-Z]" s)) "Calm down, I know what I'm doing!"
      (str/ends-with? s "?") "Sure."
      (re-matches #"[A-Z ]+" s) "Whoa, chill out!"
      (and (= s (str/upper-case s)) (str/ends-with? s "!")) "Whoa, chill out!"
      :else "Whatever.")))
