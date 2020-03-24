(ns rna-transcription
  (:require [clojure.string :as str]))

(defn trans [c]
  (cond
    (= "G" (str c)) "C"
    (= "C" (str c)) "G"
    (= "T" (str c)) "A"
    (= "A" (str c)) "U"
    :else (throw (AssertionError. (str "Invalid input character" c ".")))))

(defn to-rna [dna]
  (str/join (map trans (seq dna))))
