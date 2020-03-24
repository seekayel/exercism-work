(ns armstrong-numbers
  (:require [clojure.math.numeric-tower :as math]))

(defn digits [num] (map #(Character/digit % 10) (str num)))


(defn armstrong? [num]
  (let [dig (digits num) len (count dig)]
    (= num (reduce
      (fn exp-n-add [i j]
        (+ i (math/expt j len))) 0 dig))))
