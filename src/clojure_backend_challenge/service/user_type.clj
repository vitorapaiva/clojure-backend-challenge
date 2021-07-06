(ns clojure-backend-challenge.service.user-type
  (:require [clojure-backend-challenge.database]
            [clojure-backend-challenge.repository.user-type :as user-type-repo]
            [korma.core :refer :all]))

(defn get-user-types []
  (user-type-repo/get-user-types))

(defn add-user-type [description]
  (user-type-repo/add-user-type description))

(defn get-user-type [id]
  (user-type-repo/get-user-type id))