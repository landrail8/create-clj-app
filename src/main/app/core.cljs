(ns app.core
  (:require [reagent.dom :as r]))

(defn app []
      [:div
       [:h1 "Hello, you are just start simply html with reagent"]])

(defn ^:dev/after-load start
      []
      (r/render [app]
       (.getElementById js/document "root")))

(defn ^:export init
      []
      (start))