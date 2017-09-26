import React, { Component } from 'react';

class WeatherSearch extends Component {
  constructor() {
    super();
    this.handleChange = this.handleChange.bind(this);
    this.fetchWeather = this.fetchWeather.bind(this);
    this.state = {
        weather: [],
        temp: 0,
        url: '',
        city: '',
    };
  }

  handleChange(event) {
    this.setState({city: event.target.city});
  }

fetchWeather() {
  console.log('fetching...');
  fetch('http://api.openweathermap.org/data/2.5/weather?q=Helsinki&APPID=929924a4ce66e3ee0856d5f98131203d&units=metric')
    .then(result => result.json())
    .then(result => this.setState({
          city: this.state.city,
          weather: result.weather[0],
          temp: result.main.temp,
          url : 'http://openweathermap.org/img/w/' + result.weather[0].icon + '.png',
      })
  );

  console.log(this.state.items);
}

 render() {
    return (
      <div>
        <input type="text" value={this.state.city} onChange={this.handleChange}/>
        <button onClick={this.fetchWeather}>Send</button>
        <p>Temperature: {this.state.temp} Celsius</p>
        <p>Weather:  {this.state.weather.main}</p>
        <img alt="weathericon" src={this.state.url}/>
      </div>
    );
  }
}

export default WeatherSearch;
