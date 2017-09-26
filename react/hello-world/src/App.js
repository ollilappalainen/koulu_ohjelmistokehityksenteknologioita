import React, { Component } from 'react';
import './App.css';
import Counter from './Counter';
import List from './List';
import WeatherSearch from './reactRestWeather';

class App extends Component {
    constructor(){
        super();
        this.state = {
            value: "World!",
        };

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(event) {
        event.preventDefault();
    }

    handleChange(event) {
        this.setState({value: event.target.value});
    }

  render() {
    return (
      <div className="App">
          <div>
              <h1>Hello {this.state.value}</h1>
              <form>
                  <label>
                      <p>Send Greetings: </p>
                      <input type="text" name="name" value={this.state.value} onChange={this.handleChange}/>
                  </label>
              </form>
          </div>
          <div className="component">
              <Counter/>
          </div>
          <div className="component">
              <List />
          </div>
          <div className="component">
              <WeatherSearch />
          </div>
      </div>
    );
  }
}

export default App;
